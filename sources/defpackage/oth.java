package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: oth  reason: default package */
/* loaded from: classes2.dex */
public final class oth {
    public final int a;
    public final int b;
    public final Object c;

    public oth() {
        this.c = new oth[256];
        this.a = 0;
        this.b = 0;
    }

    public oth(int i, int i2) {
        this.c = null;
        this.a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }

    public oth(int i, int i2, List list) {
        this.b = i;
        this.a = i2;
        this.c = list;
    }

    public oth(byte[] bArr) {
        this.c = new oth[256];
        this.a = 0;
        this.b = 0;
    }

    public oth(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.b = i;
        this.a = i2;
    }

    public static obc a() {
        return new obc((byte[]) null);
    }
}
