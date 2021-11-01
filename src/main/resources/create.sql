CREATE TABLE [dbo].[InterestRate]
(
    [id]                  [bigint] IDENTITY (1,1) NOT NULL,
    [properties]      [nvarchar](4000)            NULL,
    [interestProperties]      [nvarchar](4000)            NULL,
    PRIMARY KEY CLUSTERED
(
[id] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
    ) ON [PRIMARY]
    GO

ALTER TABLE [dbo].[InterestRate]
    WITH CHECK ADD CHECK (isjson([properties]) = 1);
ALTER TABLE [dbo].[InterestRate]
    WITH CHECK ADD CHECK (isjson([interestProperties]) = 1);

GO

INSERT INTO reproduceBugDb.dbo.InterestRate (id, properties, interestProperties) VALUES (1, N'{"asdf": "hello", "test": "miep"}', null);