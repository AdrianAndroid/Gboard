package org.chromium.net;

import android.content.Context;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class CronetEngine {
    private static final String TAG = "CronetEngine";
    public static final /* synthetic */ int a = 0;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        protected final ICronetEngineBuilder mBuilderDelegate;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            this.mBuilderDelegate = iCronetEngineBuilder;
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            ArrayList arrayList = new ArrayList(CronetProvider.getAllProviders(context));
            getEnabledCronetProviders(context, arrayList);
            int i = CronetEngine.a;
            return ((CronetProvider) arrayList.get(0)).createBuilder().mBuilderDelegate;
        }

        static List getEnabledCronetProviders(Context context, List list) {
            if (list.size() == 0) {
                throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((CronetProvider) it.next()).isEnabled()) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            Collections.sort(list, new kp(14));
            return list;
        }

        /* renamed from: addPublicKeyPins */
        public Builder mo74addPublicKeyPins(String str, Set set, boolean z, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z, date);
            return this;
        }

        /* renamed from: addQuicHint */
        public Builder mo75addQuicHint(String str, int i, int i2) {
            this.mBuilderDelegate.addQuicHint(str, i, i2);
            return this;
        }

        /* renamed from: build */
        public CronetEngine mo76build() {
            return this.mBuilderDelegate.build();
        }

        public Builder enableBrotli(boolean z) {
            this.mBuilderDelegate.enableBrotli(z);
            return this;
        }

        /* renamed from: enableHttp2 */
        public Builder mo77enableHttp2(boolean z) {
            this.mBuilderDelegate.enableHttp2(z);
            return this;
        }

        /* renamed from: enableHttpCache */
        public Builder mo78enableHttpCache(int i, long j) {
            this.mBuilderDelegate.enableHttpCache(i, j);
            return this;
        }

        /* renamed from: enablePublicKeyPinningBypassForLocalTrustAnchors */
        public Builder mo79enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        /* renamed from: enableQuic */
        public Builder mo80enableQuic(boolean z) {
            this.mBuilderDelegate.enableQuic(z);
            return this;
        }

        @Deprecated
        /* renamed from: enableSdch */
        public Builder mo81enableSdch(boolean z) {
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        /* renamed from: setLibraryLoader */
        public Builder mo82setLibraryLoader(LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        /* renamed from: setStoragePath */
        public Builder mo83setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        /* renamed from: setUserAgent */
        public Builder mo84setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public static int compareVersions(String str, String str2) {
            int length;
            if (str == null || str2 == null) {
                throw new IllegalArgumentException("The input values cannot be null");
            }
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            int i = 0;
            while (true) {
                length = split.length;
                if (i >= length || i >= split2.length) {
                    break;
                }
                try {
                    int parseInt = Integer.parseInt(split[i]);
                    int parseInt2 = Integer.parseInt(split2[i]);
                    if (parseInt != parseInt2) {
                        return Integer.signum(parseInt - parseInt2);
                    }
                    i++;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Unable to convert version segments into integers: " + split[i] + " & " + split2[i], e);
                }
            }
            return Integer.signum(length - split2.length);
        }
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public abstract byte[] getGlobalMetricsDeltas();

    public abstract String getVersionString();

    /* renamed from: newUrlRequestBuilder */
    public abstract UrlRequest.Builder mo92newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url);

    public abstract void shutdown();

    public abstract void startNetLogToFile(String str, boolean z);

    public abstract void stopNetLog();
}
