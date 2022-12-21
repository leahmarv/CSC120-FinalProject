This file will contain documentation for all commands available in your game.

Note:  It's a good idea to also make this list available inside the game, in response to a `HELP` command.

help
This allows you to access the cheat sheet.

check inventory - checkInventory()
This prints the player's inventory.

check compass - getOrientation()
This returns the player's coordinates.

read sign - readSign()
This prints the message written on a sign.

turn right - turnRight()
This increases the player's x coordinate by 1.

turn left - turnLeft()
This decreases the player's x coordinate by 1.

go Up 
This decreases the player's y coordinate by 1.

go Down
This increases the player's y coordinate by 1.

pick berries - pickBerries()
This add berries to the player's inventory when encountering a berry bush.

toss berries - distract()
This removes berries from the player's inventory and sets the bear's hunger to false, allowing the player to continue.

sing - distract ()
This distracts the bear, setting its hunger to false and allowing the player to continue.

# SPOILER ALERT

If your game includes challenges that must be overcome to win, also list them below.

In order to read a sign giving directions to the exit, the bear must be scared away by singing. The bear can also be distracted with berries picked from a bush.