package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ezr  reason: default package */
/* loaded from: classes.dex */
public final class ezr {
    public int a;
    public String b;
    public final List c;
    public final List d;
    public boolean e;

    public ezr(int i) {
        this.a = 0;
        this.b = "";
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = i;
        this.e = false;
    }

    public ezr(String str) {
        this.a = 0;
        this.b = "";
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.b = str;
    }

    public ezr(boolean z) {
        this.a = 0;
        this.b = "";
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = z;
    }
}
