package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: nvf  reason: default package */
/* loaded from: classes2.dex */
public final class nvf implements nvg {
    private final Object a;
    private final Object b;
    private final /* synthetic */ int c;

    public nvf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public nvf(Object[] objArr, Object[] objArr2, int i) {
        this.c = i;
        this.a = objArr;
        this.b = objArr2;
    }

    @Override // defpackage.nvg
    public final int a() {
        if (this.c != 0) {
            return ((Object[]) this.b).length;
        }
        return 1;
    }

    public final String toString() {
        if (this.c == 0) {
            return String.format("Leaf(key=%s value=%s)", this.a, this.b);
        }
        StringBuilder sb = new StringBuilder("CollisionLeaf(");
        for (int i = 0; i < ((Object[]) this.b).length; i++) {
            sb.append("(key=");
            sb.append(((Object[]) this.a)[i]);
            sb.append(" value=");
            sb.append(((Object[]) this.b)[i]);
            sb.append(") ");
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.nvg
    public final nvg c(Object obj, Object obj2, int i, int i2) {
        Object[] objArr;
        int length;
        int i3 = 0;
        if (this.c == 0) {
            int hashCode = this.a.hashCode();
            if (hashCode != i) {
                return nve.b(new nvf(obj, obj2, 0), i, this, hashCode, i2);
            }
            Object obj3 = this.a;
            return obj3 == obj ? new nvf(obj, obj2, 0) : new nvf(new Object[]{obj3, obj}, new Object[]{this.b, obj2}, 1);
        }
        int hashCode2 = ((Object[]) this.a)[0].hashCode();
        if (hashCode2 != i) {
            return nve.b(new nvf(obj, obj2, 0), i, this, hashCode2, i2);
        }
        while (true) {
            objArr = (Object[]) this.a;
            length = objArr.length;
            if (i3 >= length) {
                i3 = -1;
                break;
            } else if (objArr[i3] == obj) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1) {
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Object[] copyOf2 = Arrays.copyOf((Object[]) this.b, ((Object[]) this.a).length);
            copyOf[i3] = obj;
            copyOf2[i3] = obj2;
            return new nvf(copyOf, copyOf2, 1);
        }
        Object[] copyOf3 = Arrays.copyOf(objArr, length + 1);
        Object[] copyOf4 = Arrays.copyOf((Object[]) this.b, ((Object[]) this.a).length + 1);
        int length2 = ((Object[]) this.a).length;
        copyOf3[length2] = obj;
        copyOf4[length2] = obj2;
        return new nvf(copyOf3, copyOf4, 1);
    }
}
