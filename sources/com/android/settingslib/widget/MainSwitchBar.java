package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.android.settingslib.widget.MainSwitchBar;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MainSwitchBar extends LinearLayout implements CompoundButton.OnCheckedChangeListener {
    protected TextView a;
    protected Switch b;
    private final List c;
    private int d;
    private int e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private View i;

    public MainSwitchBar(Context context) {
        this(context, null);
    }

    private final void e(boolean z) {
        if (!yc.c()) {
            setBackgroundColor(z ? this.e : this.d);
        } else {
            this.i.setBackground(z ? this.f : this.g);
        }
    }

    public final void a(ata ataVar) {
        if (!this.c.contains(ataVar)) {
            this.c.add(ataVar);
        }
    }

    public final void b(boolean z) {
        Switch r0 = this.b;
        if (r0 != null) {
            r0.setChecked(z);
        }
        e(z);
    }

    public final void c(CharSequence charSequence) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean d() {
        return this.b.isChecked();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        e(z);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((ata) this.c.get(i)).ff(z);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        asz aszVar = (asz) parcelable;
        super.onRestoreInstanceState(aszVar.getSuperState());
        this.b.setChecked(aszVar.a);
        b(aszVar.a);
        e(aszVar.a);
        setVisibility(true != aszVar.b ? 8 : 0);
        this.b.setOnCheckedChangeListener(true != aszVar.b ? null : this);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        asz aszVar = new asz(super.onSaveInstanceState());
        aszVar.a = this.b.isChecked();
        aszVar.b = getVisibility() == 0;
        return aszVar;
    }

    @Override // android.view.View
    public final boolean performClick() {
        this.b.performClick();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
        this.b.setEnabled(z);
        if (yc.c()) {
            if (z) {
                this.i.setBackground(d() ? this.f : this.g);
            } else {
                this.i.setBackground(this.h);
            }
        }
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.f145060_resource_name_obfuscated_res_0x7f0e0524, this);
        if (!yc.c()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843829});
            this.e = obtainStyledAttributes.getColor(0, 0);
            this.d = context.getColor(R.color.f29860_resource_name_obfuscated_res_0x7f0606d8);
            obtainStyledAttributes.recycle();
        }
        setFocusable(true);
        setClickable(true);
        this.i = findViewById(R.id.f55640_resource_name_obfuscated_res_0x7f0b0220);
        this.a = (TextView) findViewById(R.id.f129290_resource_name_obfuscated_res_0x7f0b214d);
        this.b = (Switch) findViewById(16908352);
        if (yc.c()) {
            this.f = getContext().getDrawable(R.drawable.f50950_resource_name_obfuscated_res_0x7f080397);
            this.g = getContext().getDrawable(R.drawable.f50940_resource_name_obfuscated_res_0x7f080396);
            this.h = getContext().getDrawable(R.drawable.f50930_resource_name_obfuscated_res_0x7f080395);
        }
        a(new ata() { // from class: asy
            @Override // defpackage.ata
            public final void ff(boolean z) {
                MainSwitchBar.this.b(z);
            }
        });
        if (this.b.getVisibility() == 0) {
            this.b.setOnCheckedChangeListener(this);
        }
        b(this.b.isChecked());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ait.g, 0, 0);
            c(obtainStyledAttributes2.getText(4));
            obtainStyledAttributes2.recycle();
        }
        e(this.b.isChecked());
    }
}
