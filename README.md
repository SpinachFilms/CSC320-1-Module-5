# CSC320-1-Module-5

Pseudocode

 Start

1. Create an empty list called daysOfWeek
2. Create an empty list called temperatures

3. Repeat until the user types "week":
    3.1. Prompt user to enter a day of the week (or "week" to finish)
    3.2. Read user input and store it in variable day

4.    If day is not "week":
    4.1    Add day to daysOfWeek list
    4.2    Prompt user to enter the average temperature for that day
    4.3    Read input and store it in variable temp
    4.4    Add temp to temperatures list

5. If "week" is entered:
    5.1 Display "Weekly Summary:"
    5.2 Initialize variable sum = 0
    5.3 For each index in the lists:
    5.4    Display day and its corresponding temperature
    5.5    Add temperature to sum
    5.6 Calculate average by dividing sum by the number of temperatures
    5.7 Display weekly average

End