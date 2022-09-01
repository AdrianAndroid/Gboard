package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: loj  reason: default package */
/* loaded from: classes.dex */
public final class loj extends lse implements lok {
    loh[] a;
    final /* synthetic */ lol d;
    private final Object e;
    private int f = 0;
    public int b = 0;
    public lok c = this;
    private lok g = this;

    public loj(lol lolVar, Object obj, int i) {
        this.d = lolVar;
        this.e = obj;
        this.a = new loh[jez.I(i)];
    }

    private final int a() {
        return this.a.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [lok] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int H = jez.H(obj);
        int a = a() & H;
        loh lohVar = this.a[a];
        for (loh lohVar2 = lohVar; lohVar2 != null; lohVar2 = lohVar2.d) {
            if (lohVar2.g(obj, H)) {
                return false;
            }
        }
        loh lohVar3 = new loh(this.e, obj, H, lohVar);
        lol.I(this.g, lohVar3);
        lol.I(lohVar3, this);
        lol.H(this.d.d.a(), lohVar3);
        lol.H(lohVar3, this.d.d);
        loh[] lohVarArr = this.a;
        lohVarArr[a] = lohVar3;
        int i = this.f + 1;
        this.f = i;
        this.b++;
        int length = lohVarArr.length;
        if (i > length && length < 1073741824) {
            int i2 = length + length;
            loh[] lohVarArr2 = new loh[i2];
            this.a = lohVarArr2;
            int i3 = i2 - 1;
            for (loh lohVar4 = this.c; lohVar4 != this; lohVar4 = lohVar4.d()) {
                loh lohVar5 = lohVar4;
                int i4 = lohVar5.c & i3;
                lohVar5.d = lohVarArr2[i4];
                lohVarArr2[i4] = lohVar5;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.a, (Object) null);
        this.f = 0;
        for (lok lokVar = this.c; lokVar != this; lokVar = lokVar.d()) {
            lol.G((loh) lokVar);
        }
        lol.I(this, this);
        this.b++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int H = jez.H(obj);
        for (loh lohVar = this.a[a() & H]; lohVar != null; lohVar = lohVar.d) {
            if (lohVar.g(obj, H)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.lok
    public final lok d() {
        return this.c;
    }

    @Override // defpackage.lok
    public final void e(lok lokVar) {
        this.g = lokVar;
    }

    @Override // defpackage.lok
    public final void f(lok lokVar) {
        this.c = lokVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new loi(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int H = jez.H(obj);
        int a = a() & H;
        loh lohVar = null;
        for (loh lohVar2 = this.a[a]; lohVar2 != null; lohVar2 = lohVar2.d) {
            if (lohVar2.g(obj, H)) {
                if (lohVar == null) {
                    this.a[a] = lohVar2.d;
                } else {
                    lohVar.d = lohVar2.d;
                }
                lol.I((lok) Objects.requireNonNull(lohVar2.e), lohVar2.d());
                lol.G(lohVar2);
                this.f--;
                this.b++;
                return true;
            }
            lohVar = lohVar2;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
