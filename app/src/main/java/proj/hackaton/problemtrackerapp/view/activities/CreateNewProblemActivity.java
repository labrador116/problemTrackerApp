package proj.hackaton.problemtrackerapp.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import proj.hackaton.problemtrackerapp.R;
import proj.hackaton.problemtrackerapp.presenter.CreateNewProblemActivityPresenter;
import proj.hackaton.problemtrackerapp.view.fragments.CreateNewProblemFragment;

public class CreateNewProblemActivity extends AppCompatActivity {
    private CreateNewProblemActivityPresenter mPresenter;
    private CreateNewProblemFragment mFragment;

    public CreateNewProblemActivity(){
        mPresenter = new CreateNewProblemActivityPresenter();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_new_problem_activity);

        mPresenter.createNewFragment(this,mFragment);
    }
}
