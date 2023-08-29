# ALBUM HTML
<div>
<img src="https://github.com/Joo-Veloper/-----album/assets/134623719/a453c04b-b5d8-44a2-8f32-7a9428fc4a48">
</div>

Logbook(개발일지)

# code

 
     <script>
        function openclose(){
            $('#postingbox').toggle();
        }
        function makeCard(){
            let image = $('#image').val();
            let title = $('#title').val();
            let content = $('#content').val();
            let date = $('#date').val();

            let temp_html = `            
            <div class="col">
                <div class="card h-100">
                    <img src="${image}"
                        class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">${title}</h5>
                        <p class="card-text">${content}</p>
                    </div>
                    <div class="card-footer">
                        <small class="text-body-secondary">${date}</small>
                    </div>
                </div>
            </div>`;
            $('#card').append(temp_html)
        }
       </script>


## TIL
  이 코드는 HTML과 JavaScript를 사용하여 웹 페이지에서 동적으로 카드를 생성하고 토글 기능을 제공하는 기능을 구현하는 데 사용됩니다. 여러 가지 동작을 수행하는 함수들이 정의되어 있습니다.

1. `openclose()` 함수:
   - 이 함수는 `postingbox` 요소를 토글합니다. 이것은 아마도 사용자가 어떤 내용을 입력하는 상자나 패널을 열거나 닫을 때 사용될 것입니다.
   - `$('#postingbox').toggle();` 라인은 jQuery 라이브러리를 사용하여 `postingbox` 요소의 가시성을 토글합니다. 요소가 보이면 숨겨지고, 숨겨져 있으면 보이게 됩니다.

2. `makeCard()` 함수:
   - 이 함수는 사용자 입력을 바탕으로 카드를 동적으로 생성합니다.
   - `image`, `title`, `content`, `date` 등의 값은 각각 사용자가 입력한 데이터로 설정됩니다.
   - `temp_html` 변수에 카드의 HTML 구조를 문자열 템플릿을 사용하여 정의합니다. 사용자 입력 데이터가 해당 위치에 삽입됩니다.
   - 마지막으로, `$('#card').append(temp_html)` 라인은 `card` 요소 내에 새로운 카드를 추가합니다.
이 코드에서 jQuery 라이브러리를 사용하고 있으며, 사용자가 이미지 URL, 제목, 내용, 날짜를 입력하여 카드를 생성하고, 특정 요소를 토글하여 상호작용하는 웹 페이지의 동작을 담당합니다.

