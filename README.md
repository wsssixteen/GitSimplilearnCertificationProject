# GitSimplilearnCertificationProject

My work for the Simplilearn project submission.

The commands:

1st Step

Created a repository in GitHub named GitSimplilearnCertificationProject

git clone https://github.com/wsssixteen/GitSimplilearnCertificationProject.git

cd GitSimplilearnCertificaionProject

git pull origin main

touch project.java | code project.java | git add . | git commit -m “Main: Added project.java”

git branch hotFixBranch | git branch integrationBranch

code project.java | git add . | git commit -m “Main: Use thread-safe string.”

git push origin main


2nd Step

git checkout integrationBranch

git branch iBrFeature1 | git branch iBrFeature2

git checkout iBrFeature2 | code project.java | git add . | git commit -m “iBrF2: Added completion date.”

git checkout integrationBranch | git merge iBrFeature2

git checkout iBrFeature1 

code project.java | git add . | git commit -m “iBrF1: Added name.”

code project.java | git add . | git commit -m “iBrF1:  Added CEO name.”

git rebase integrationBranch

git checkout hotFixBranch | git merge integrationBranch 

git checkout main | git merge hotFixBranch (solve conflicts)

git checkout hotFixBranch | git merge integrationBranch

git checkout main | git merge hotFixBranch (solve conflicts)

git checkout iBrFeature1

code project.java | git add . | git commit -m “iBrF1:  Added certification code.”



3rd Step

git checkout integrationBranch | git merge iBrFeature1

git checkout hotFixBranch | git merge integrationBranch

git checkout main | git merge hotFixBranch | <resolve issue> | … git commit -m “Main: REL02.00.00”

git checkout hotFixBranch | code project.java | git add . | git commit -m “hFBr: Added message.”

git checkout integrationBranch | git merge hotFixBranch

git checkout main | git merge hotFixBranch