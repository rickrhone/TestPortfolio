/* ******************** EXERCISE 1 *******************************************************
Create an array to represent your shopping list with the following items: 'pop tarts', 'ramen noodles', 'chips', 'salsa', and 'coffee'.
Add 'fruit loops' to the list.
Update 'coffee' to 'fair trade coffee'
Replace 'chips' and 'salsa' with 'rice' and 'beans'
Create an empty array to represent your shopping cart.
Remove the last item from your shopping list and add it to your cart
Remove the first item from your shopping list and add it to the cart
Write a 'while' loop that takes items from your shopping list and moves them to your cart until there are no items left on the list.
Sort the items in your cart alphabetically... backwards
Print the list of items in your shopping cart to the console as comma separated string.
*/

let shoppingList = ["pop tarts", "ramen noodles", "chips", "salsa", "coffee"]; //Creates shopping list array
console.log(shoppingList);
shoppingList.push("fruit loops"); //Adds 'fruit loops' to the shopping list
console.log(shoppingList);
shoppingList[shoppingList.indexOf("coffee")] = "fair trade coffee"; //Updates 'coffee' to 'fair trade coffee'
console.log(shoppingList);
shoppingList.splice(2, 2, "rice", "beans"); //Replaces 'chips' and 'salsa' with 'rice' and 'beans'
console.log(shoppingList);

let shoppingCart = []; //Creates an empty array to represent the shopping cart
shoppingCart.push(shoppingList.pop()); //Removes the last item from the shopping list and adds it to the shopping cart
console.log(shoppingList);
console.log(shoppingCart);
shoppingCart.unshift(shoppingList.shift()); //Removes the first item from the shopping list and adds it to the shopping cart
console.log(shoppingList);
console.log(shoppingCart);

//While loop that takes items from the shopping list and moves them to the shopping cart until there are no items left on the list.
let itemsInList = shoppingList.length;
while (itemsInList > 0) {
    shoppingCart.push(shoppingList.shift()); //removes item from shopping list and adds it to shopping cart
    itemsInList = shoppingList.length; //updates item list count
}
console.log(shoppingList);
console.log(shoppingCart);
shoppingCart.sort().reverse(); //sorts the shopping cart alphabetically in ascending order then reverses the array to provide alphabetically sorting in descending order (backwards)
console.log(shoppingCart);

//Print the list of items in your shopping cart to the console as comma separated string
let itemsInCart = shoppingCart.length;
while (itemsInCart > 0) {
    console.log(shoppingCart[itemsInCart - 1] + ","); //Prints the list of items in the shopping cart to the console as comma separated string
    itemsInCart = itemsInCart - 1; //updates items in cart count
}

/* ******************** EXERCISE 2 *******************************************************
Given the following object, get the following values:
Name of the course ('JavaScript Applications')
Name of the second teacher ('Shane')
Name of the first student ('Steve')
Katy's computer type ('macbook')
The preReq equipment object
The second OSOption from equipment prereqs ('osx')
string listing the OSOptions separated by 'or' ('linux or osx')
An array of all the students that are using OSX.
*/

var course = {
    name: "JavaScript Applications",
    awesome: true,
    teachers: ["Assaf", "Shane"],
    students: [{
            name: "Steve",
            computer: {
                OS: "Linux",
                type: "laptop"
            }
        },
        {
            name: "Katy",
            computer: {
                OS: "OSX",
                type: "macbook"
            }
        },
        {
            name: "Chuck",
            computer: {
                OS: "OSX",
                type: "macbook"
            }
        }
    ],
    preReqs: {
        skills: ["html", "css", "git"],
        equipment: {
            laptop: true,
            OSOptions: ["linux", "osx"]
        }
    }
};

console.log("Name of Course: " + course.name); //Name of the course ('JavaScript Applications')
console.log("Name of second teacher: " + course.teachers[1]); //Name of the second teacher ('Shane')
console.log("Name of first student: " + course.students[0].name); //Name of the first student ('Steve')
console.log("Katy's computer type: " + course.students[1].computer.type); //Katy's computer type ('macbook')
console.log("The preReq equipment object: " + course.preReqs.equipment); //The preReq equipment object
console.log("The second OSOption from equipment prereqs: " + course.preReqs.equipment.OSOptions[1]); //The second OSOption from equipment prereqs ('osx')
console.log("String listing the OSOptions separated by 'or': " + course.preReqs.equipment.OSOptions[0] + " or " + course.preReqs.equipment.OSOptions[1]); //string listing the OSOptions separated by 'or' ('linux or osx')
//An array of all the students that are using OSX.
let studentsWithOSX = []; //declares empty array to store names
for (let i = 0; i < course.students.length; i++) { //loops through the students array
    if (course.students[i].computer.OS === "OSX") {
        studentsWithOSX.push(course.students[i].name); //add the students name to empty array if they use OSX
    }
}
console.log(studentsWithOSX); //logs the array to console 


/*
Create an object that models the data of your favorite email application.
For each bullet in your outline, decide if it is a primative, array, or object.
Use this information to create an object literal that models the application's data. 

*/

//Object to model Gmail 
var gmailAppData = {
    name: 'Gmail',
    mailboxes: [
        'inbox',
        'starred',
        'snoozed',
        sent = [],
        drafts = {
            draft1: "",
            draft2: ""
        },
        'chats',
        'all mail',
        'spam',
        'trash',
    ],
    Categories: [
        'social', 'updates', 'forums', 'promotions'
    ],
    emails: {
        email1: 'hey buddy how are you?',
        email2: 'Jane the project is now due on 5/31/2019',
        email3: 'are you going to Jakes party today?'
    }
}

/*
Get a list of inbox names
Get a list of emails
Get the text of the second email in the visible list
Mark an email as sent
Add a draft email to the drafts mailbox
   */

console.log(gmailAppData.mailboxes); //Get a list of inbox names
console.log(gmailAppData.emails); //Get a list of emails
console.log(gmailAppData.emails.email2); //Get the text of the second email in the visible list
console.log(gmailAppData.mailboxes[gmailAppData.mailboxes.indexOf(drafts)].draft1 = 'This is a draft email 1'); //Add a draft email to the drafts mailbox
console.log(gmailAppData.mailboxes[gmailAppData.mailboxes.indexOf(drafts)].draft2 = 'This is a draft email 2'); //Add a draft email to the drafts mailbox
//Draft email2 has now been added to the sent box
gmailAppData.mailboxes[gmailAppData.mailboxes.indexOf(sent)].push('sent: ' + gmailAppData.mailboxes[gmailAppData.mailboxes.indexOf(drafts)].draft2); //adds the draft 2 email to the sent folder with the word sent
console.log(gmailAppData.mailboxes[gmailAppData.mailboxes.indexOf(sent)]); //displays the sent folder 