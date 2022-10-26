<!-- Remove Staged Changes -->
<!-- This will restore the git add . command -->

git restore --staged filename

<!-- Check the history of Git Repo -->

git log

<!-- Delete my Commits to Specific Commit Id -->
<!-- This will remove all commits after this commit id and all files will be unstaged along commit -->

git reset --commitid

<!-- Stashing Changes - this will not add to the commit history but we can use changes in future -->
<!-- https://youtu.be/apGV9Kg7ics?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=1354 -->

<!-- only after gaa not commiting changes, but want to use for later -->

git stash

<!-- Popping stash, Get all Stashed Changes -->

git stash pop

<!-- Clear Stash -->

git stash clear
