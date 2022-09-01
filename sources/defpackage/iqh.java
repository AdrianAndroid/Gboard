package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: iqh  reason: default package */
/* loaded from: classes.dex */
public final class iqh extends iqg {
    private iqh(lfb lfbVar, iqj iqjVar) {
        super(lfbVar, iqjVar, 1);
    }

    public static iqh a(hhl hhlVar) {
        iqh iqhVar = new iqh(lfb.g(hhlVar), iqj.COMMA_SEPARATED);
        iqhVar.i();
        return iqhVar;
    }

    public static iqh e(String str) {
        iqh iqhVar = new iqh(ldu.a, iqj.COMMA_SEPARATED);
        super.h(str);
        return iqhVar;
    }

    @Override // defpackage.iqg
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return str;
    }

    @Override // defpackage.iqg
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        return !TextUtils.isEmpty((String) obj);
    }

    @Override // defpackage.iqg
    public final /* synthetic */ boolean d(Object obj, lmz lmzVar) {
        return lmzVar.contains((String) obj);
    }
}
