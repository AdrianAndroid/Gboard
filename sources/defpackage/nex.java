package defpackage;

/* compiled from: PG */
/* renamed from: mbr  reason: default package */
/* loaded from: classes.dex */
public enum mbr implements nfp {
    UNKNOWN_CONTENT_TYPE(0),
    EXPRESSION_STICKER(1),
    BITMOJI_STICKER(2),
    AVATAR_STICKER(3),
    DYNAMIC_ART_STICKER(10),
    PLAY_STORE_STICKER(4),
    TENOR_STICKER(5),
    EMOJI_KITCHEN_STICKER(6),
    EMOJI_KITCHEN_MIX(9),
    IMAGE_SEARCH_GIF(7),
    TENOR_GIF(8);
    
    public final int l;

    mbr(int i) {
        this.l = i;
    }

    public static mbr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONTENT_TYPE;
            case 1:
                return EXPRESSION_STICKER;
            case 2:
                return BITMOJI_STICKER;
            case 3:
                return AVATAR_STICKER;
            case 4:
                return PLAY_STORE_STICKER;
            case 5:
                return TENOR_STICKER;
            case 6:
                return EMOJI_KITCHEN_STICKER;
            case 7:
                return IMAGE_SEARCH_GIF;
            case 8:
                return TENOR_GIF;
            case 9:
                return EMOJI_KITCHEN_MIX;
            case 10:
                return DYNAMIC_ART_STICKER;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mbm.c;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}Override // defpackage.ndx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ij();
        ngb.h(collection);
        if (!(collection instanceof nex)) {
            return super.addAll(collection);
        }
        nex nexVar = (nex) collection;
        int i = nexVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.c;
            if (i3 > dArr.length) {
                this.c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(nexVar.c, 0, this.c, this.d, nexVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d) {
        ij();
        int i = this.d;
        double[] dArr = this.c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.c = dArr2;
        }
        double[] dArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // defpackage.nga
    public final /* bridge */ /* synthetic */ nga e(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new nex(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nex)) {
            return super.equals(obj);
        }
        nex nexVar = (nex) obj;
        if (this.d != nexVar.d) {
            return false;
        }
        double[] dArr = nexVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        g(i);
        return Double.valueOf(this.c[i]);
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + ngb.c(Double.doubleToLongBits(this.c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        ij();
        g(i);
        double[] dArr = this.c;
        double d = dArr[i];
        if (i < this.d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        ij();
        if (i2 >= i) {
            double[] dArr = this.c;
            System.arraycopy(dArr, i2, dArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        ij();
        g(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private nex(double[] dArr, int i) {
        this.c = dArr;
        this.d = i;
    }

    @Override // defpackage.ndx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }
}
