package defpackage;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dkj  reason: default package */
/* loaded from: classes.dex */
public final class dkj {
    public static final lug a = hin.a;
    public static volatile dkj b;
    public final Object c = new Object();
    public final Set d = new HashSet();

    public static boolean b(File file, File file2) {
        try {
            return file.renameTo(file2);
        } catch (RuntimeException e) {
            ((luc) ((luc) ((luc) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/hmm/userdictionary/UserDictVersionManager", "moveFile", 269, "UserDictVersionManager.java")).G("Moving data file fails: %s -> %s", file, file2);
            return false;
        }
    }

    public final void a(dij dijVar, dki dkiVar) {
        dijVar.F(dkiVar.h.getName(), dkiVar.g, dkiVar.d, dkiVar.e);
        synchronized (this.c) {
            this.d.add(dkiVar.a);
        }
        kcu.U(gxo.a(5).hQ(new cak(this, dijVar, dkiVar, 5)), new bvo(dijVar, dkiVar, 10), mjl.a);
    }
}
