<img height="70" align="right" src="./modget-1.16/src/main/resources/assets/modget/icon.png"> 

# Modget-Minecraft
[![CurseForge downloads](https://cf.way2muchnoise.eu/modget.svg)](https://www.curseforge.com/minecraft/mc-mods/modget)
[![CurseForge versions](https://cf.way2muchnoise.eu/versions/modget.svg)](https://www.curseforge.com/minecraft/mc-mods/modget)
[![Modrinth downloads](https://img.shields.io/badge/dynamic/json?color=5da545&label=modrinth&prefix=downloads%20&query=downloads&url=https://api.modrinth.com/api/v1/mod/modget&style=flat&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHZpZXdCb3g9IjAgMCAxMSAxMSIgd2lkdGg9IjE0LjY2NyIgaGVpZ2h0PSIxNC42NjciICB4bWxuczp2PSJodHRwczovL3ZlY3RhLmlvL25hbm8iPjxkZWZzPjxjbGlwUGF0aCBpZD0iQSI+PHBhdGggZD0iTTAgMGgxMXYxMUgweiIvPjwvY2xpcFBhdGg+PC9kZWZzPjxnIGNsaXAtcGF0aD0idXJsKCNBKSI+PHBhdGggZD0iTTEuMzA5IDcuODU3YTQuNjQgNC42NCAwIDAgMS0uNDYxLTEuMDYzSDBDLjU5MSA5LjIwNiAyLjc5NiAxMSA1LjQyMiAxMWMxLjk4MSAwIDMuNzIyLTEuMDIgNC43MTEtMi41NTZoMGwtLjc1LS4zNDVjLS44NTQgMS4yNjEtMi4zMSAyLjA5Mi0zLjk2MSAyLjA5MmE0Ljc4IDQuNzggMCAwIDEtMy4wMDUtMS4wNTVsMS44MDktMS40NzQuOTg0Ljg0NyAxLjkwNS0xLjAwM0w4LjE3NCA1LjgybC0uMzg0LS43ODYtMS4xMTYuNjM1LS41MTYuNjk0LS42MjYuMjM2LS44NzMtLjM4N2gwbC0uMjEzLS45MS4zNTUtLjU2Ljc4Ny0uMzcuODQ1LS45NTktLjcwMi0uNTEtMS44NzQuNzEzLTEuMzYyIDEuNjUxLjY0NSAxLjA5OC0xLjgzMSAxLjQ5MnptOS42MTQtMS40NEE1LjQ0IDUuNDQgMCAwIDAgMTEgNS41QzExIDIuNDY0IDguNTAxIDAgNS40MjIgMCAyLjc5NiAwIC41OTEgMS43OTQgMCA0LjIwNmguODQ4QzEuNDE5IDIuMjQ1IDMuMjUyLjgwOSA1LjQyMi44MDljMi42MjYgMCA0Ljc1OCAyLjEwMiA0Ljc1OCA0LjY5MSAwIC4xOS0uMDEyLjM3Ni0uMDM0LjU2bC43NzcuMzU3aDB6IiBmaWxsLXJ1bGU9ImV2ZW5vZGQiIGZpbGw9IiM1ZGE0MjYiLz48L2c+PC9zdmc+)](https://modrinth.com/mod/modget)
![Environment: both](https://img.shields.io/badge/environment-both-1976d2?style=flat)
[![Discord chat](https://img.shields.io/badge/chat%20on-discord-7289DA?logo=discord&logoColor=white)](https://discord.gg/6bTGYFppfz)

The Minecraft Mod Package Manager!

Modget is based on TheBrokenRail's [ModUpdater](https://gitea.thebrokenrail.com/TheBrokenRail/ModUpdater) mod and is inspired heavily by Microsoft's [Winget](https://github.com/microsoft/winget-cli).


## Commands
Currently, Modget supports the following commands:
```
/modget list                     Lists all installed mods recognized by modget
/modget repos list               Lists all installed manifest repositories
/modget repos add <repo url>     Adds a custom repository
/modget repos enable <repo id>   Enables the selected repository
/modget repos disable <repo id>  Disables the selected repository
/modget repos remove <repo id>   Removes the selected repository
/modget search <mod>             Searches all repositories for a matching mod
/modget upgrade                  Lists all available mod updates
/modget refresh                  Refreshes the local manifest cache
```

These additional commands will be added over the next few releases:
```
/modget install <mod>            Downloads the according mod
/modget uninstall <mod>          Deletes the according mod
/modget upgrade <mod>            Updates the according mod
/modget upgrade --all            Updates all mods
```

If you're on a server, use `/modgetserver` instead of `/modget`.

In contrast to the original ModUpdater, Modget doesn't require specific opt-ins. It detects mods based on their modid and gets the update files using its manifest repository.


## GUI
We also have a WIP GUI. To access it, please install [Mod Menu](https://modrinth.com/mod/modmenu)!
![image](https://user-images.githubusercontent.com/48808497/146324594-9be0d900-9597-4e97-b237-85bfe8595795.png)



## Mod Developers
If you want to add first-party support for your mods, please regularly submit new versions over at the [manifest repository](https://github.com/ReviversMC/modget-manifests).

If you want to disable Modget's automatic update checks for your mod (in case you have implemented a custom solution), add the following to your `fabric.mod.json`:
```json
{
    "custom": {
        "modget": {
            "noAutoCheck": "true"
        }
    }
}
```
Note that manual checks started by the user will still show updates for your mod.

Other values you can add are:
- `preferredPlatform`: Can take the values `curseforge`, `modrinth` or `sourceControl` and determines which platform Modget should prioritize when attempting to download your mod.


## Community
[![Discord chat](https://img.shields.io/badge/chat%20on-discord-7289DA?logo=discord&logoColor=white)](https://discord.gg/6bTGYFppfz)

We have an [official Discord community](https://discord.gg/6bTGYFppfz) for all of our projects. By joining, you can:
- Get installation help and technical support with all of our mods
- Be notified of the latest developments as they happen
- Get involved and collaborate with the rest of our team
- ... and just hang out with the rest of our community.


## Contributors
<a href="https://github.com/ReviversMC/modget-minecraft/graphs/contributors">
  <img height="40em" src="https://contrib.rocks/image?repo=ReviversMC/modget-minecraft" />
</a>
