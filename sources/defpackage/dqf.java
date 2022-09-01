package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dqf  reason: default package */
/* loaded from: classes.dex */
public final class dqf extends ls {
    private final llp d;

    public dqf(llp llpVar) {
        this.d = llpVar;
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        return new hcr((AppCompatTextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f143460_resource_name_obfuscated_res_0x7f0e0466, viewGroup, false));
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.d.size();
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        ((AppCompatTextView) ((hcr) moVar).s).setText(((hqt) this.d.get(i)).o(0));
    }
}
