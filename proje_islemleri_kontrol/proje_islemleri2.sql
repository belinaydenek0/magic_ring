CREATE DATABASE tasktrackerdb;

USE TaskTrackerDB;

CREATE TABLE Projects (
    ProjectID INT PRIMARY KEY auto_increment,
    ProjectName NVARCHAR(100) NOT NULL,
    CreatedDate DATETIME DEFAULT now()
);

INSERT INTO Projects(ProjectName)
VALUES
('Website Project'),
('Mobile App'),
('School Assignment');