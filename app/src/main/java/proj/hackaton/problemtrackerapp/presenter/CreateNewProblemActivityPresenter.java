package proj.hackaton.problemtrackerapp.presenter;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import proj.hackaton.problemtrackerapp.R;
import proj.hackaton.problemtrackerapp.view.fragments.CreateNewProblemFragment;

/**
 * Created by sbt-markin-aa on 20.04.17.
 */

public class CreateNewProblemActivityPresenter {

    public void createNewFragment(AppCompatActivity activity, Fragment fragment){
        if (fragment == null){
            fragment = CreateNewProblemFragment.newInstance();
        }
        activity.getSupportFragmentManager().beginTransaction().add(R.id.new_problem_fragment_container, fragment).commit();
    }
}
