package com.google.android.apps.inputmethod.libs.search.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchCandidateListHolderView extends LinearLayout {
    public final int a;
    public final List b;
    public final List c;
    public final List d;
    public elg e;
    private final int f;

    public SearchCandidateListHolderView(Context context) {
        this(context, null);
    }

    public SearchCandidateListHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchCandidateListHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        if (attributeSet != null) {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, ele.b);
                try {
                    this.f = typedArray.getResourceId(0, 0);
                    int i2 = typedArray.getInt(1, 0);
                    this.a = i2;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    dbg dbgVar = new dbg(new edc(this, 7), 0);
                    elf elfVar = new elf(this);
                    LayoutInflater from = LayoutInflater.from(context);
                    while (i2 > 0) {
                        View inflate = from.inflate(this.f, (ViewGroup) this, false);
                        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.f65290_resource_name_obfuscated_res_0x7f0b074f);
                        appCompatTextView.setOnClickListener(dbgVar);
                        appCompatTextView.setOnLongClickListener(elfVar);
                        ImageView imageView = (ImageView) inflate.findViewById(R.id.f68010_resource_name_obfuscated_res_0x7f0b08b3);
                        imageView.setOnClickListener(dbgVar);
                        addView(inflate);
                        this.b.add(appCompatTextView);
                        this.c.add((ImageView) inflate.findViewById(R.id.f68030_resource_name_obfuscated_res_0x7f0b08b5));
                        this.d.add(imageView);
                        i2--;
                    }
                    Drawable dividerDrawable = getDividerDrawable();
                    dividerDrawable.setTintList(hjg.n(context).a(R.color.f30900_resource_name_obfuscated_res_0x7f0608be));
                    setDividerDrawable(dividerDrawable);
                    Collections.reverse(this.b);
                    Collections.reverse(this.c);
                    Collections.reverse(this.d);
                } catch (Throwable th) {
                    th = th;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray = null;
            }
        } else {
            throw new IllegalArgumentException("SearchCandidateListHolderView needs attributes.");
        }
    }
}
