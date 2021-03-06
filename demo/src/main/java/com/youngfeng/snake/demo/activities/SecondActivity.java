package com.youngfeng.snake.demo.activities;

import android.view.MotionEvent;
import android.view.View;

import com.youngfeng.snake.Snake;
import com.youngfeng.snake.annotations.EnableDragToClose;
import com.youngfeng.snake.demo.R;
import com.youngfeng.snake.demo.annotations.BindView;
import com.youngfeng.snake.demo.ui.BaseActivity;
import com.youngfeng.snake.demo.utils.Util;
import com.youngfeng.snake.view.SnakeTouchInterceptor;

import butterknife.OnClick;

/**
 * The first activity.
 *
 * @author Scott Smith 2017-12-24 17:01
 */
@BindView(layoutId = R.layout.activity_second)
@EnableDragToClose()
public class SecondActivity extends BaseActivity {

    @Override
    protected void onInitView() {
        super.onInitView();
        Snake.host(this);
    }

    @OnClick(R.id.btn_star_this_repo)
    public void starRepo() {
        Util.openGitRepo(this);
    }

    @OnClick(R.id.btn_follow_the_authors_article)
    public void openAuthorsJianshu() {
        Util.openJianshu(this);
    }
}
