# Design Patterns Workshop

Concepts and example code for design patterns workshop

## Prerequisites

The concept discussed in this workshop are language agnostic.  

The source code examples are build using Visual Studio 2019 using .NET Core 3.1 framework.

C# language is used to build classes and test classes.

xUnit test framework is used to create test cases.


## Steps to run test cases in Visual Studio 2019:
	1. In package manager console of VS 2019 cd to path with solution. Eample is given below.
		cd .\C#\ch02-singleton\ex01-eager-initialization\src\
	2. Run test cases with below command.
		dotnet test

		It gives below sample output.

		---------------------------------------------------------------------------------------------------------------------------------
		PM> dotnet test
		Test run for C:\Users\skamble\Source\Repos\sumkamble\design-patterns-workshop\C#\ch02-singleton\ex01-eager-initialization\src\Main.Tests\bin\Debug\netcoreapp3.1\Main.Tests.dll(.NETCoreApp,Version=v3.1)
		Microsoft (R) Test Execution Command Line Tool Version 16.5.0
		Copyright (c) Microsoft Corporation.  All rights reserved.

		Starting test execution, please wait...

		A total of 1 test files matched the specified pattern.

		Test Run Successful.
		Total tests: 1
			 Passed: 1
		 Total time: 2.1138 Seconds
		PM> 
		---------------------------------------------------------------------------------------------------------------------------------

##References

	1. To create solution, projects, classes and test cases using dotnet commands.
		https://docs.microsoft.com/en-us/dotnet/core/testing/unit-testing-with-dotnet-test
	2. Working with GitHub in Visual Studio 2019
		https://azuredevopslabs.com/labs/devopsserver/github/