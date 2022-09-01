package defpackage;

import android.content.Context;
import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* compiled from: PG */
/* renamed from: owp  reason: default package */
/* loaded from: classes2.dex */
public final class owp extends owj {
    public owp(Context context) {
        super(context);
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        super.d(str, set, date);
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        super.e(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if (this.a == null) {
            this.a = getDefaultUserAgent();
        }
        return new owo(this);
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        super.a(i);
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        super.b(str);
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        super.c(i);
        return this;
    }

    @Override // defpackage.owj, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.a = str;
        return this;
    }
}
