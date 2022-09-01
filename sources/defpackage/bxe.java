package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Printer;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: bxe  reason: default package */
/* loaded from: classes.dex */
public final class bxe implements bxd, ifw {
    private final bxg c = new bxg();
    public final bwz b = new bwz(gxo.c(5));

    @Override // defpackage.bxd
    public final llp a(String str) {
        llp a;
        synchronized (this.c) {
            a = this.c.a(str, hqp.e());
        }
        return a;
    }

    @Override // defpackage.bxd
    public final String b() {
        String str;
        hpy hpyVar = this.b.c;
        Locale e = hqp.e();
        synchronized (this.c) {
            bxg bxgVar = this.c;
            str = (String) bxgVar.b.get(hpyVar);
            if (str == null) {
                str = "";
                if (!TextUtils.isEmpty(hpyVar.c)) {
                    String obj = hpyVar.c.toString();
                    int i = hpyVar.d;
                    BreakIterator breakIterator = (BreakIterator) bxgVar.a.get(e);
                    if (breakIterator == null) {
                        breakIterator = BreakIterator.getSentenceInstance(e);
                        bxgVar.a = llw.l(e, breakIterator);
                    }
                    breakIterator.setText(obj);
                    int first = breakIterator.first();
                    int next = breakIterator.next();
                    while (true) {
                        int i2 = next;
                        int i3 = first;
                        first = i2;
                        if (first != -1) {
                            if (i < i3 || i > first) {
                                next = breakIterator.next();
                            } else {
                                str = obj.substring(i3, first).trim();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    bxgVar.b = llw.l(hpyVar, str);
                }
            }
        }
        return str;
    }

    @Override // defpackage.bxd
    public final String c() {
        return this.b.a();
    }

    @Override // defpackage.bxd
    public final String d(int i) {
        return bxg.b(this.b.a(), i);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean e = e();
        printer.println("isActive = " + e);
        boolean isEmpty = b().isEmpty();
        printer.println("currentInputSentenceIsEmpty = " + isEmpty);
        printer.println("currentLocale = ".concat(String.valueOf(String.valueOf(hqp.e()))));
    }

    @Override // defpackage.bxd
    public final boolean e() {
        return this.b.b.get();
    }

    @Override // defpackage.bxd
    public final /* synthetic */ int f() {
        return ffb.r(this);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ConversationContextProcessorModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.b.close();
    }
}
