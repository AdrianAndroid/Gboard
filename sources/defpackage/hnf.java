package defpackage;

import android.view.inputmethod.CompletionInfo;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: hnf  reason: default package */
/* loaded from: classes.dex */
public final class hnf implements Iterator, j$.util.Iterator {
    private final CompletionInfo[] b;
    private final hlk c = hln.a();
    public int a = 0;

    public hnf(CompletionInfo[] completionInfoArr) {
        this.b = completionInfoArr;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a */
    public final hln next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        CompletionInfo[] completionInfoArr = this.b;
        int i = this.a;
        this.a = i + 1;
        CompletionInfo completionInfo = completionInfoArr[i];
        if (completionInfo == null) {
            return null;
        }
        CharSequence label = completionInfo.getLabel();
        if (label == null) {
            label = completionInfo.getText();
        }
        if (label == null) {
            return null;
        }
        hlk hlkVar = this.c;
        hlkVar.c();
        hlkVar.a = label;
        hlkVar.e = hlm.APP_COMPLETION;
        hlkVar.j = completionInfo;
        return hlkVar.a();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.length;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
