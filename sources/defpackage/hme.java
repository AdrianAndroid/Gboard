package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hme  reason: default package */
/* loaded from: classes.dex */
public final class hme extends ArrayList {
    public final void a(String[] strArr) {
        ensureCapacity(size() + strArr.length);
        hlk a = hln.a();
        for (String str : strArr) {
            a.c();
            a.a = str;
            add(a.a());
        }
    }
}
