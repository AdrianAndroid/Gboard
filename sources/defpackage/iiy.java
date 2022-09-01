package defpackage;

import android.text.TextUtils;
import android.util.Printer;

/* compiled from: PG */
/* renamed from: iiy  reason: default package */
/* loaded from: classes.dex */
public abstract class iiy implements ijh {
    @Override // defpackage.ijg
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
        jco.f(this, printer);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        ijk ijkVar = (ijk) ijf.b.get(getClass());
        String str = ijkVar != null ? ijkVar.a : "";
        return TextUtils.isEmpty(str) ? super.toString() : str;
    }
}
