# PocketHub

Mobile app towards partial fulfilment of interview for mapprr.

A mobile application using GitHub api to search through repositories. Filter results. Select a repository and see the details of project and contributors. On selecting contributor, list the repositories tagged to the contributors and from that user should be able to again select his repositories and so on so forth. Application consists of three screens. Home screen where you search and display list of repositories. Repo Details screen where you list of necessary information about the repository. Contributors screen where his/her details and list of repositories are mentioned. Necessary information is listed below.

- Home:
    - A search bar to search from git API's
    - A recycler view using card view to display the search results.
    - The results are sorted in the descending order of the "watchers" count.
    - The results count should be limited to 10.
    - Clicking on a item to go to Repo Details Acticity

- Repo Details:
    - This Activity should have detailed description of the selected item.
    - Details such as Image,Name,Project Link, Description,Contributors should be displayed.
    - When clicked on project link the url should be opened in a In app Browser(Web View)
    - When clicked on a contributor it should  go to Contributor Details

- Contributor Details:
    - This Activity should have detailed description of the contributor.
    - Details such as Contributor Avatar(image),RepoList.
    - Recycler view with card view should be used to display the repo list.
    - Clicking on a item from the repo list it should display the detailed description of the repo in a new Activity (Repo Details).
    
 ![GNU GPL v3](https://www.gnu.org/graphics/gplv3-127x51.png)