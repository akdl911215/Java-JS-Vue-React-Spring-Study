// 단축평가 사용법 1.
// 객체를 가리키기를 기대하는 변수가 null 또는 undefined가 아닌지 확인하고 프로퍼티를 참조할 때

var elem = null;
// elem이 null 이나 undefined와 같은 Falsy 값이면 elem으로 평가되고
// elem이 Truthy 값이면 elem.value로  평가된다.

var value = elem && elem.value;
console.log(typeof value, value) // object null