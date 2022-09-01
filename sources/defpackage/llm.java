package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: llm  reason: default package */
/* loaded from: classes.dex */
public final class llm extends llp {
    private final transient llp a;

    public llm(llp llpVar) {
        this.a = llpVar;
    }

    private final int E(int i) {
        return (size() - 1) - i;
    }

    private final int F(int i) {
        return size() - i;
    }

    @Override // defpackage.llp
    public final llp a() {
        return this.a;
    }

    @Override // defpackage.llp, defpackage.llg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.llp
    public final llp d(int i, int i2) {
        jdg.E(i, i2, size());
        return this.a.subList(F(i2), F(i)).a();
    }

    @Override // java.util.List
    public final Object get(int i) {
        jdg.N(i, size());
        return this.a.get(E(i));
    }

    @Override // defpackage.llp, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return E(lastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.llp, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf >= 0) {
            return E(indexOf);
        }
        return -1;
    }

    @Override // defpackage.llg
    public final boolean m() {
        return this.a.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.llp, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
