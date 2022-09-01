package defpackage;

import android.view.inputmethod.InputConnection;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: hpo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hpo implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ hpo(int i, InputConnection inputConnection, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = inputConnection;
        this.b = i2;
        this.c = i3;
    }

    public /* synthetic */ hpo(InputConnection inputConnection, int i, int i2, int i3, int i4) {
        this.e = i4;
        this.d = inputConnection;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public /* synthetic */ hpo(hmd hmdVar, int i, int i2, int i3, int i4) {
        this.e = i4;
        this.d = hmdVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.inputmethod.InputConnection, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        CharSequence e;
        int length;
        int i = this.e;
        if (i == 0) {
            ?? r0 = this.d;
            int i2 = this.a;
            int i3 = this.b;
            int i4 = this.c;
            ltg ltgVar = hpr.a;
            return hpw.b(r0, i2, i3, i4);
        } else if (i != 1) {
            int i5 = this.a;
            ?? r1 = this.d;
            int i6 = this.b;
            int i7 = this.c;
            ltg ltgVar2 = hpr.a;
            CharSequence charSequence = "";
            if (i5 > 0) {
                try {
                    e = hpw.e(r1, i5, i6);
                } finally {
                }
            } else {
                e = charSequence;
            }
            if (i7 > 0) {
                charSequence = hpw.d(r1, i7, i6);
            }
            CharSequence c = hpw.c(r1, i6);
            if (e == null && charSequence == null && c == null) {
                return null;
            }
            int i8 = -1;
            if (i5 > 0 && e != null && (length = e.length()) >= 0 && length < i5) {
                i8 = 0;
            }
            return new hqk(hpr.b(e), hpr.b(charSequence), hpr.b(c), i8);
        } else {
            return ((hmd) this.d).a.hT(this.a, this.b, this.c);
        }
    }
}
