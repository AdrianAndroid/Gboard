package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.SoftKeyView;
import java.util.List;

/* compiled from: PG */
/* renamed from: eez  reason: default package */
/* loaded from: classes.dex */
public final class eez extends ls {
    public List d = llp.q();
    private final jdr e;
    private final LayoutInflater f;
    private final gqc g;
    private final float h;
    private final int i;

    public eez(Context context, jdr jdrVar, gqc gqcVar, float f, int i) {
        this.e = jdrVar;
        this.h = f;
        this.i = i;
        this.g = gqcVar;
        this.f = LayoutInflater.from(context);
    }

    @Override // defpackage.ls
    public final mo d(ViewGroup viewGroup, int i) {
        SoftKeyView softKeyView = (SoftKeyView) this.f.inflate(R.layout.f145360_resource_name_obfuscated_res_0x7f0e0542, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, (int) (viewGroup.getMeasuredHeight() / this.h));
        int i2 = this.i;
        marginLayoutParams.setMargins(i2, 0, i2, 0);
        softKeyView.setLayoutParams(marginLayoutParams);
        softKeyView.j(this.e);
        softKeyView.i(this.g);
        return new mo(softKeyView);
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.d.size();
    }

    @Override // defpackage.ls
    public final void o(mo moVar, int i) {
        ((SoftKeyView) moVar.a).n((ict) this.d.get(i));
    }
}
