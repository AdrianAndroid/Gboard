package com.google.android.libraries.stickers.megamode;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MegamodeAvatarBannerView extends ConstraintLayout {
    public ImageView c;
    public TextView d;
    public ProgressBar e;
    private TextView f;
    private ImageButton g;
    private TextView h;

    public MegamodeAvatarBannerView(Context context) {
        super(context);
    }

    public final void c(int i) {
        this.d.setVisibility(i);
        this.f.setVisibility(i);
        this.g.setVisibility(i);
        this.h.setVisibility(i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageView) findViewById(R.id.f52540_resource_name_obfuscated_res_0x7f0b00ab);
        this.d = (TextView) findViewById(R.id.f52560_resource_name_obfuscated_res_0x7f0b00ad);
        this.f = (TextView) findViewById(R.id.f52550_resource_name_obfuscated_res_0x7f0b00ac);
        this.g = (ImageButton) findViewById(R.id.f53680_resource_name_obfuscated_res_0x7f0b013a);
        this.h = (TextView) findViewById(R.id.f53690_resource_name_obfuscated_res_0x7f0b013b);
        this.e = (ProgressBar) findViewById(R.id.f52530_resource_name_obfuscated_res_0x7f0b00aa);
    }

    public MegamodeAvatarBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
