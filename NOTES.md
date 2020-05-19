#Lessons learned.


*I have an issue with mintty it looks like a sub-process dead lock, I' have to reset my computer, re-install git,
make some changes in the windows settings all of this doesn't work.
What helps me to go through it was*

```sh
Get-Item -Path "C:\Program Files\Git\usr\bin\*.exe" | %{ Set-ProcessMitigation -Name $_.Name -Disable ForceRelocateImages }
```