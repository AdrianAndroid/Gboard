package defpackage;

import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;

/* compiled from: PG */
/* renamed from: fcc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fcc implements hle {
    private final /* synthetic */ int d;
    public static final /* synthetic */ fcc c = new fcc(2);
    public static final /* synthetic */ fcc b = new fcc(1);
    public static final /* synthetic */ fcc a = new fcc(0);

    private /* synthetic */ fcc(int i) {
        this.d = i;
    }

    @Override // defpackage.hle
    public final void a(View view) {
        int i = this.d;
        if (i == 0) {
            fdz.d(view, "ondevice_banner");
            ((LinkableTextView) view.findViewById(R.id.f130740_resource_name_obfuscated_res_0x7f0b2206)).a = fce.a;
        } else if (i != 1) {
            ifm.a(view, true);
        } else {
            view.setOnClickListener(bwk.g);
        }
    }
}
