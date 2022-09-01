package defpackage;

import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* renamed from: hcr  reason: default package */
/* loaded from: classes.dex */
public final class hcr extends mo {
    public static final /* synthetic */ int t = 0;
    public final View s;

    public hcr(View view, byte[] bArr) {
        super(view);
        this.s = view;
    }

    public final void F(hei heiVar, String[] strArr) {
        ((EmojiView) this.s).d(heiVar);
        ((EmojiView) this.s).b = strArr;
    }

    public hcr(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.s = appCompatTextView;
    }

    public hcr(View view) {
        super(view);
        this.s = (CheckBox) view.findViewById(R.id.f68480_resource_name_obfuscated_res_0x7f0b08ee);
    }

    public hcr(ViewGroup viewGroup, LayoutInflater layoutInflater, int i, int i2, hej hejVar) {
        super(layoutInflater.inflate(R.layout.f134170_resource_name_obfuscated_res_0x7f0e0082, viewGroup, false));
        if (Build.VERSION.SDK_INT == 28) {
            this.a.setLayerType(1, null);
        }
        this.a.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        EmojiView emojiView = (EmojiView) this.a.findViewById(R.id.f54310_resource_name_obfuscated_res_0x7f0b0193);
        this.s = emojiView;
        emojiView.d = null;
        emojiView.e = null;
        emojiView.setClickable(true);
        emojiView.e(hejVar);
    }
}
