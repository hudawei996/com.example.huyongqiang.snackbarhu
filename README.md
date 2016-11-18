# com.example.huyongqiang.snackbarhu
### 可以在AppCompatActivity子类中，实现在topbar之下显示向下展示的snackBar。非AppCompatActivity，则会在最顶端显示，使用时需要注意。使用时和snackbar使用规则一样。
例如：
SnackbarHu.make(findViewById(R.id.button), "A Snackbar is a lightweight material", SnackbarHu.LENGTH_LONG).setAction("知道了", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(getApplicationContext(), "beidianji", Toast.LENGTH_SHORT).show();
            }
        }).show();
![image](https://github.com/huyongqiang/com.example.huyongqiang.snackbarhu/blob/master/%E5%B1%8F%E5%B9%95%E5%BF%AB%E7%85%A7%202016-11-18%20%E4%B8%8B%E5%8D%882.47.59.png)
