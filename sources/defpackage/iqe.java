package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* renamed from: iqe  reason: default package */
/* loaded from: classes.dex */
public final class iqe extends iqg {
    private iqe(lfb lfbVar, iqj iqjVar, int i) {
        super(lfbVar, iqjVar, i);
    }

    public static iqe a(hhl hhlVar) {
        return f(hhlVar, iqj.COMMA_SEPARATED, 1);
    }

    public static iqe e(hhl hhlVar, int i) {
        return f(hhlVar, iqj.COMMA_SEPARATED, i);
    }

    public static iqe f(hhl hhlVar, iqj iqjVar, int i) {
        iqe iqeVar = new iqe(lfb.g(hhlVar), iqjVar, i);
        iqeVar.i();
        return iqeVar;
    }

    public static iqe g(String str) {
        iqe iqeVar = new iqe(ldu.a, iqj.COMMA_SEPARATED, 3);
        super.h(str);
        return iqeVar;
    }

    @Override // defpackage.iqg
    public final /* bridge */ /* synthetic */ Object b(String str) {
        if (!str.isEmpty()) {
            return str.charAt(str.length() + (-1)) == '*' ? new ein(str.substring(0, str.length() - 1), 18) : new ein(str, 19);
        }
        throw new IllegalArgumentException("Item is empty");
    }

    @Override // defpackage.iqg
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        return !TextUtils.isEmpty((String) obj);
    }

    @Override // defpackage.iqg
    public final /* bridge */ /* synthetic */ boolean d(Object obj, lmz lmzVar) {
        return lre.ah(lmzVar, new ein((String) obj, 17));
    }
}
