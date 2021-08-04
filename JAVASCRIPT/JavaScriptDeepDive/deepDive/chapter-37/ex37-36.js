const map = new Map();

const lee = { name: 'Lee' };
const kim = { name: 'Kim' };

map.set(lee, 'bank-clerk').set(kim, 'student');

console.log('map.get(lee) : ', map.get(lee));
console.log('map.get(key) : ', map.get('key'));
// console.log('map.get(student) : ', map.get(student)); // error
console.log('map.get(student) : ', map.get('student'));
