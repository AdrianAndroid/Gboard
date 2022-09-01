package com.google.android.libraries.inputmethod.ime.password;

import android.content.Context;
import com.google.android.libraries.inputmethod.ime.AbstractIme;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PasswordIme extends AbstractIme {
    private static final xv a = xv.a(0, 0);
    private final hnn b;
    private final hno c;

    public PasswordIme(Context context, iav iavVar, hls hlsVar) {
        super(context, iavVar, hlsVar);
        this.b = new hnn(hlsVar, true);
        this.c = new hno(hlsVar, false);
    }

    private static int b(hfd hfdVar) {
        Integer num = (Integer) hfdVar.b[0].e;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.hlp
    public final boolean B(hfd hfdVar) {
        int i = hfdVar.b[0].c;
        switch (i) {
            case -10063:
                if (this.P) {
                    return true;
                }
                this.b.e(0);
                this.b.b();
                return true;
            case -10062:
                this.c.a();
                return true;
            case -10061:
                this.c.b(a);
                this.c.h(b(hfdVar));
                return true;
            default:
                switch (i) {
                    case -10054:
                        this.c.c(b(hfdVar));
                        return true;
                    case -10053:
                        this.c.h(b(hfdVar));
                        return true;
                    case -10052:
                        int b = b(hfdVar);
                        if (this.P) {
                            return true;
                        }
                        hnn hnnVar = this.b;
                        if (hnnVar.b || hnnVar.a(b).length() <= 0) {
                            return true;
                        }
                        this.E.hu(0, 0, "", "", "", "", "");
                        return true;
                    case -10051:
                        if (this.P) {
                            return true;
                        }
                        this.b.e(b(hfdVar));
                        return true;
                    case -10050:
                        int b2 = b(hfdVar);
                        if (this.P) {
                            return true;
                        }
                        this.b.d(a);
                        this.b.e(b2);
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // defpackage.hlp
    public final void gX() {
    }

    @Override // defpackage.hlp
    public final void h(hfd hfdVar) {
    }

    @Override // defpackage.hlp
    public final void w(int i) {
    }
}
