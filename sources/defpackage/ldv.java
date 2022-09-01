package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: ldv  reason: default package */
/* loaded from: classes.dex */
abstract class ldv implements Iterator, j$.util.Iterator {
    final CharSequence b;
    final lek c;
    final boolean d;
    int f;
    private Object g;
    public int a = 2;
    int e = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public ldv(lfy lfyVar, CharSequence charSequence) {
        this.c = (lek) lfyVar.c;
        this.d = lfyVar.a;
        this.f = lfyVar.b;
        this.b = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int b;
        int a;
        jdg.F(this.a != 4);
        int i = this.a;
        int i2 = i - 1;
        String str = null;
        if (i != 0) {
            if (i2 == 0) {
                return true;
            }
            if (i2 != 2) {
                this.a = 4;
                int i3 = this.e;
                while (true) {
                    int i4 = this.e;
                    if (i4 != -1) {
                        b = b(i4);
                        if (b == -1) {
                            b = this.b.length();
                            this.e = -1;
                            a = -1;
                        } else {
                            a = a(b);
                            this.e = a;
                        }
                        if (a == i3) {
                            int i5 = a + 1;
                            this.e = i5;
                            if (i5 > this.b.length()) {
                                this.e = -1;
                            }
                        } else {
                            while (i3 < b && this.c.b(this.b.charAt(i3))) {
                                i3++;
                            }
                            while (b > i3) {
                                int i6 = b - 1;
                                if (!this.c.b(this.b.charAt(i6))) {
                                    break;
                                }
                                b = i6;
                            }
                            if (!this.d || i3 != b) {
                                break;
                            }
                            i3 = this.e;
                        }
                    } else {
                        this.a = 3;
                        break;
                    }
                }
                int i7 = this.f;
                if (i7 == 1) {
                    b = this.b.length();
                    this.e = -1;
                    while (b > i3) {
                        int i8 = b - 1;
                        if (!this.c.b(this.b.charAt(i8))) {
                            break;
                        }
                        b = i8;
                    }
                } else {
                    this.f = i7 - 1;
                }
                str = this.b.subSequence(i3, b).toString();
                this.g = str;
                if (this.a != 3) {
                    this.a = 1;
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.a = 2;
            Object obj = this.g;
            this.g = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
