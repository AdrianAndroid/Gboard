package defpackage;

/* compiled from: PG */
/* renamed from: omr  reason: default package */
/* loaded from: classes2.dex */
public final class omr extends ojn {
    final /* synthetic */ oms a;

    public omr(oms omsVar) {
        this.a = omsVar;
    }

    @Override // defpackage.ojj
    public final int a() {
        return this.a.a.groupCount() + 1;
    }

    @Override // defpackage.ojj, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.contains((String) obj);
    }

    @Override // defpackage.ojn, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        String group = this.a.a.group(i);
        return group == null ? "" : group;
    }

    @Override // defpackage.ojn, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.indexOf((String) obj);
    }

    @Override // defpackage.ojn, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.lastIndexOf((String) obj);
    }
}
