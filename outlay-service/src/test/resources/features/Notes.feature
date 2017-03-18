Feature: when user opens tracker application

Scenario: user save the note
	Given Note has title mynote and body hello world!!
	When save the note
	Then it should save the note with title mynote into database