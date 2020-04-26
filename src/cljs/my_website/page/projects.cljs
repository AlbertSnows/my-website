(ns my-website.page.projects)

(def image-dir "../images/")

(def classes "brief-border href-item-container")

(def project-page-header
  [:p {:id "project-header"} "Projects"])

(defn box-container [contents] [:div {:class "flex box align-horizontal"} (seq contents)])

(defn image-container [src alt]
  [:img {:src src :alt alt}])

(defn image-href-container [id class href src alt]
  [:div {:id id :class class}
   [:a {:href href :target "__blank" :rel "noopener noreferrer"}
    (image-container src alt)]])

(defn project-description [title description]
  [:div {:class "description-container"}
   [:div {:class "text-align-left"} title]
   [:div {:class "description text-align-left"} description]])

(def project-page-body
  [:div {:id "project-body"}
   (box-container
     [(image-href-container
        "my-website"
        classes
        "https://github.com/AlbertSnows/MyWebsite"
        (str image-dir "this_website.PNG")
        "This Website")
      (project-description
        "This Website"
        "The website you're perusing")])
   (box-container
     [(image-href-container
        "first-website"
        classes
        "https://github.com/AlbertSnows/FWRcljs"
        (str image-dir "kistners_flowers.PNG")
        "My First Website")
      (project-description
        "My First website"
        "First website for class.
         Written from Javascript -> Typescript -> Clojurescript over the semester")])
   (box-container
     [(image-href-container
        "snake-game"
        classes
        "https://github.com/AlbertSnows/snake_game"
        (str image-dir "snake_rust.PNG")
        "Snake Game")
      (project-description "Snake Game" "Wrote Snake in Rust")])
   (box-container
     [(image-href-container
        "game-jam-2018"
        classes
        "https://github.com/AlbertSnows/To-Change-A-Lightbulb"
        (str image-dir "lightbulb.PNG")
        "To Change A Light Bulb")
      (project-description
        "To Change A Light Bulb"
        "A beautiful disaster written over a weekend during a game jam")])
   (box-container
     [(image-href-container
        "thermal-modeling"
        classes
        "https://github.com/AlbertSnows/HumanThermalModeling"
        (str image-dir "thermal_modeling.PNG")
        "Human Thermal Modeling")
      (project-description
        "Human Thermal Modeling"
        "Multi-threading graduate student's research code")])
   (box-container
     [(image-href-container
        "roguelike"
        classes
        "https://github.com/AlbertSnows/2DRogueLike"
        (str image-dir "2Drouge.PNG")
        "2D Rogue Like")
      (project-description "2D Rogue Like" "First game made in Unity")])
   (box-container
     [(image-href-container
        "edgesweeper"
        classes
        "https://github.com/AlbertSnows/python-tkinter-minesweeper"
        (str image-dir "minesweeper.PNG")
        "Edgesweeper")
      (project-description
        "Edgesweeper"
        "Took Minesweeper, written in python, and added a feature")])
   (box-container
     [(image-href-container
        "first-unity"
        classes
        "https://github.com/AlbertSnows/RollABall"
        (str image-dir "rollaball.PNG")
        "Roll A Ball")
      (project-description "Roll A Ball" "First tutorial exposure to Unity")])
   (box-container
     [(image-href-container
        "mobile-app-game"
        classes
        "https://github.com/AlbertSnows/SimpleMobileGame"
        (str image-dir "first_app.PNG")
        "Simple App")
      (project-description
        "Simple App"
        "Playing with Java/Kotlin in Android Studio")])])
