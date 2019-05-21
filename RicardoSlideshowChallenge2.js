// Ricardo Rhone JavaScript Functions Part 2 lab: Slideshow Challenge 

/*
Create a single object named slideshow that represents the data 
and functionality of a picture slideshow. 
There should be NO VARIABLES OUTSIDE THE OBJECT. 
The object should have properties for:

An array called photoList that contains the names of the photos as strings
An integer currentPhotoIndex that represents which photo in the photoList is currently displayed
A nextPhoto() function that moves currentPhotoIndex to the next index if there is one, and: 4. 
logs the current photo name. 4. Otherwise, log "End of slideshow";
A prevPhoto() function that does the same thing, but backwards.
A function getCurrentPhoto() that returns the current photo from the list.
*/

let slideshow = { // Create a single object named slideshow that represents the data and functionality of a picture slideshow

  //An array called photoList that contains the names of the photos as strings
  photoList: ['photo1', 'photo2', 'photo3', 'photo4', 'photo5'],

  // An integer currentPhotoIndex that represents which photo in the photoList is currently displayed
  currentPhotoIndex: 0,

  /*
  A nextPhoto() function that moves currentPhotoIndex to the next index if there is one, and: 4. 
  logs the current photo name. 4. Otherwise, log "End of slideshow";
  */
  nextPhoto: function () {
    console.log('\nNext Photo Function Section');
    let numPhotos = this.photoList.length;

    while (numPhotos > 0) {
      //logs the current photo name.
      console.log('Current photo name: ' + this.photoList[this.currentPhotoIndex]);
      //moves currentPhotoIndex to the next index if there is one
      this.currentPhotoIndex = this.currentPhotoIndex + 1;
      numPhotos = numPhotos - 1; //decrements count of photos 
    }

    //log "End of slideshow"
    if (numPhotos === 0) {
      console.log('End of slideshow');
      this.currentPhotoIndex = this.photoList.length - 1;
    }
  },

  //A prevPhoto() function that does the same thing, but backwards.
  prevPhoto: function () {
    console.log('\nPrev Photo Function Section');
    let numPhotos = this.photoList.length;
    this.currentPhotoIndex = this.photoList.length - 1

    while (numPhotos > 0) {
      //logs the current photo name.
      console.log('Current photo name: ' + this.photoList[this.currentPhotoIndex]);
      //moves currentPhotoIndex to the next index if there is one
      this.currentPhotoIndex = this.currentPhotoIndex - 1;
      numPhotos = numPhotos - 1; //decrements count of photos 
    }

    //log "End of slideshow"
    if (numPhotos === 0) {
      console.log('Start of slideshow');
      this.currentPhotoIndex = this.currentPhotoIndex + 1;
    }
  },

  //A function getCurrentPhoto() that returns the current photo from the list.
  getCurrentPhoto: function () {
    console.log('\nGet Photo Function Section');
    return console.log('This is the current photo: ' + this.photoList[this.currentPhotoIndex]);
  },
  //create an empty property named playInterval
  playInterval: null,

  //Create A play() function that moves to the next photo ever 2000ms until the end.
  play: function () {
    console.log('\nPlay Function Section');
    var self = this; //saves this to a variable called self 
    this.playInterval = setInterval(function () {
      self.nextPhoto()
    }, 2000);
  },

  // Create A pause() function that stops the slideshow 
  pause: function () {
    console.log('\nPause Function Section');
    clearInterval(this.playInterval);
  },

}

console.log(slideshow.nextPhoto()); //logs the nextPhoto function 
console.log(slideshow.prevPhoto()); //logs the prevPhoto function 
console.log(slideshow.getCurrentPhoto()); //logs the getCurrentPhoto function 
console.log(slideshow.play()); //logs the play function -- nothing to display 
console.log(slideshow.pause()); //logs the pause function -- nothing to display