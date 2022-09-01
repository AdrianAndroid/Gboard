package defpackage;

import android.view.inputmethod.CompletionInfo;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: hlh  reason: default package */
/* loaded from: classes.dex */
public final class hlh implements Iterator, lrd {
    public final int b;
    private final CompletionInfo[] c;
    private final String e;
    private final boolean f;
    private final long g;
    private final boolean h;
    private final hlk d = hln.a();
    public int a = 0;

    public hlh(CompletionInfo[] completionInfoArr, String str, boolean z, int i, long j, boolean z2) {
        this.c = completionInfoArr;
        this.e = str;
        this.f = z;
        this.b = i;
        this.g = j;
        this.h = z2;
    }

    @Override // j$.util.Iterator
    /* renamed from: a */
    public final hln next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        hln b = b();
        this.a++;
        return b;
    }

    public final hln b() {
        CompletionInfo completionInfo;
        if (hasNext() && (completionInfo = this.c[this.a]) != null) {
            CharSequence label = completionInfo.getLabel();
            if (label == null) {
                label = completionInfo.getText();
            }
            if (label == null) {
                return null;
            }
            hlk hlkVar = this.d;
            hlkVar.c();
            hlkVar.a = label;
            hlkVar.e = hlm.APP_COMPLETION;
            hlkVar.j = new hlg(completionInfo, this.f, this.b, this.g);
            hlkVar.k = this.e;
            if (this.h) {
                this.d.s = 10;
            }
            return this.d.a();
        }
        return null;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        CompletionInfo[] completionInfoArr = this.c;
        return completionInfoArr != null && this.a < completionInfoArr.length;
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
