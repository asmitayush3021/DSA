`1. git init`-> Powers your folder to be managed by git,and initiates a new empty repository.
It also creates a .git folder that has all the relevant logic
to manage versions of your project.

2. `Workin Area`->There can be a branch of files that are not currently handles by git.It means that changes done 
or to be done in those files are not managed by git yet.A files which is in
working area is considered to be not in staging area.When we do `git
status` and we see a bunch of `untracked files` then these are actually called to 
be in the working area.

3. `Staging area`->What all files are going to be part of the the next version that we will create.This staging
area is the place where git knows what changes will be done from the last
version to the new version.

4. `Repository Area` ->This area actually contains the details of all your previous registered version.And the files 
in this area, git already manages them and knows their version history.

5. `git add <files>`->moves file from working area to staging area.

6. `git rm --cached <files>` -> moves file back from staging area to working area.

7. `commit` ->Commit is  a particular version of the project.It captures a snapshot
of the project staged changes and creates a version out of it.

8.  `git commit` ->registers staging changes to a commit.

9.  `git log` ->list downs all the commits of the repository.If you want to exit out
of git log press `q`.


