package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.os.Bundle;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fuj  reason: default package */
/* loaded from: classes.dex */
public class fuj {
    public String a;
    public String b;
    public boolean c;
    ApplicationErrorReport d;
    private final Bundle e;
    private final List f;
    private boolean g;
    private String h;
    private fyb i;

    @Deprecated
    public fuj() {
        this.e = new Bundle();
        this.f = new ArrayList();
        this.d = new ApplicationErrorReport();
        this.h = giw.g();
    }

    public ful a() {
        ful fulVar = new ful(new ApplicationErrorReport());
        fulVar.m = null;
        fulVar.f = null;
        fulVar.a = null;
        fulVar.c = this.a;
        fulVar.b = this.e;
        fulVar.e = this.b;
        fulVar.h = this.f;
        fulVar.i = this.c;
        fulVar.j = null;
        fulVar.k = null;
        fulVar.l = this.g;
        fulVar.r = this.i;
        fulVar.n = this.h;
        fulVar.o = false;
        fulVar.p = 0L;
        fulVar.q = false;
        return fulVar;
    }

    public final void b(fyb fybVar, boolean z) {
        if ((!this.e.isEmpty() || !this.f.isEmpty()) && this.g != z) {
            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.g = z;
        this.i = fybVar;
    }

    public fuj(Context context) {
        String g;
        gfs.b(context);
        this.e = new Bundle();
        this.f = new ArrayList();
        this.d = new ApplicationErrorReport();
        try {
            if (((Boolean) fuv.b.a()).booleanValue()) {
                g = System.currentTimeMillis() + "_" + Math.abs(new SecureRandom().nextLong());
            } else {
                g = giw.g();
            }
            this.h = g;
        } catch (SecurityException unused) {
            this.h = giw.g();
        }
    }
}
