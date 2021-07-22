package sg.edu.rp.c346.id20032316.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context context;
    int layout_id;
    ArrayList<ToDoItem> toDoList;

    public CustomAdapter( Context context, int resource,  ArrayList<ToDoItem> objects) {
        super(context, resource, objects);

        this.context = context;
        this.layout_id = resource;
        this.toDoList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvAction = rowView.findViewById(R.id.tvAction);
        TextView tvDate = rowView.findViewById(R.id.tvDate);

        ToDoItem item = toDoList.get(position);

        tvAction.setText(item.getTitle());
        tvDate.setText(item.toString());

        return rowView;
    }
}
