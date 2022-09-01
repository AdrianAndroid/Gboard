package defpackage;

import java.io.Closeable;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: eof  reason: default package */
/* loaded from: classes.dex */
public final class eof implements Closeable, eoc {
    public final jav a;
    public final eod b;
    final /* synthetic */ eoh c;
    private final juc d;
    private volatile byz e = null;
    private volatile boolean f = false;

    public eof(eoh eohVar, juc jucVar) {
        this.c = eohVar;
        this.d = jucVar;
        jav f = eot.f(jucVar);
        this.a = f == null ? jav.d : f;
        this.b = eot.e(jucVar);
    }

    @Override // defpackage.eoc
    public final jav a() {
        return this.a;
    }

    @Override // defpackage.eoc
    public final String b() {
        if (this.f) {
            return null;
        }
        if (this.e != null) {
            return c();
        }
        eol eolVar = this.c.c;
        try {
            this.e = (byz) mio.h(eolVar.d.b(eolVar.c), new eoi(d(), 0), eolVar.e).get(100L, TimeUnit.MILLISECONDS);
            if (this.e == null) {
                return null;
            }
            return c();
        } catch (InterruptedException e) {
            ((ltd) ((ltd) ((ltd) eoh.a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/spellchecker/superpacks/SpellCheckerDataManager$DataModel", "getModelAbsolutePath", (char) 167, "SpellCheckerDataManager.java")).t("Open pack is interrupted.");
            Thread.currentThread().interrupt();
            return null;
        } catch (Exception e2) {
            ((ltd) ((ltd) ((ltd) eoh.a.d()).i(e2)).k("com/google/android/apps/inputmethod/libs/spellchecker/superpacks/SpellCheckerDataManager$DataModel", "getModelAbsolutePath", (char) 171, "SpellCheckerDataManager.java")).t("Failed to open pack.");
            return null;
        }
    }

    final String c() {
        eod eodVar = eod.UNKNOWN;
        int ordinal = this.b.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? "" : new File(this.e.b(), "translation_model.pb").getAbsolutePath();
        }
        return this.e.b().getAbsolutePath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e != null) {
            this.f = true;
            this.e.close();
            this.e = null;
        }
    }

    public final String d() {
        return this.d.i();
    }
}
