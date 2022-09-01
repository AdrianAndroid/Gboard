package defpackage;

import java.text.BreakIterator;

/* compiled from: PG */
/* renamed from: hdu  reason: default package */
/* loaded from: classes.dex */
final class hdu extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return BreakIterator.getCharacterInstance();
    }
}
