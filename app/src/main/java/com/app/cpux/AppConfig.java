package com.app.cpux;

import com.app.cpux.advertise.AppConfigExt;

import java.io.Serializable;

import dreamspace.ads.sdk.data.AdNetworkType;

public class AppConfig extends AppConfigExt implements Serializable {

    /* -------------------------------------- INSTRUCTION : ----------------------------------------
     * This is config file used for this app, you can configure Ads, Notification, and General data from this file
     * some values are not explained and can be understood easily according to the variable name
     * value can change remotely (optional), please read documentation to follow instruction
     *
     * variable with UPPERCASE name will NOT fetch / replace with remote config
     * variable with LOWERCASE name will fetch / replace with remote config
     * See video Remote Config tutorial https://www.youtube.com/watch?v=tOKXwOTqOzA
     ----------------------------------------------------------------------------------------------*/

    /* set true for fetch config with firebase remote config, */
    public static final boolean USE_REMOTE_CONFIG = false;

    /* config for Ad Network */
    public static class Ads {

        /* enable disable ads */
        public boolean ad_enable = true;

        /* MULTI Ad network selection,
         * Fill this array to enable ad backup flow, left this empty to use single ad_network above
         * app will try show sequentially from this array
         * example flow ADMOB > FAN > IRONSOURCE
         *
         * OPTION :
         * ADMOB,MANAGER, FAN, UNITY, IRONSOURCE, APPLOVIN, APPLOVIN_MAX, APPLOVIN_DISCOVERY,
         * STARTAPP, WORTISE, FAN_BIDDING_ADMOB, FAN_BIDDING_AD_MANAGER, FAN_BIDDING_APPLOVIN_MAX,
         * FAN_BIDDING_IRONSOURCE
         * */
        public AdNetworkType[] ad_networks = {
                AdNetworkType.ADMOB
        };

        /* ad backup flow retry attempt cycle */
        public Integer retry_from_start_max = 2;

        public boolean ad_enable_gdpr = true;

        /* disable enable ads each page */
        public boolean ad_main_banner = false;
        public boolean ad_main_interstitial = true;
        public boolean ad_splash_open_app = false;
        public boolean ad_global_open_app = true;

        /* when ad networks not supported open app format, it will replace with interstitial format
         * for placement after plash screen only */
        public boolean ad_replace_unsupported_open_app_with_interstitial_on_splash = true;

        /* maximum load time in second for open app ads */
        public Integer limit_time_open_app_loading = 10;

        /* show interstitial after several action, this value for action counter */
        public Integer ad_inters_interval = 5;

        /* ad unit for ADMOB */
        public String ad_admob_publisher_id = "pub-2916714021613915";
        public String ad_admob_banner_unit_id = "ca-app-pub-2916714021613915/8090465783";
        public String ad_admob_interstitial_unit_id = "ca-app-pub-2916714021613915/3552416987";
        public String ad_admob_rewarded_unit_id = "ca-app-pub-2916714021613915/1489530236";
        public String ad_admob_open_app_unit_id = "ca-app-pub-2916714021613915/9926253645";

        /* ad unit for Google Ad Manager */
        public String ad_manager_banner_unit_id = "/6499/example/banner";
        public String ad_manager_interstitial_unit_id = "/6499/example/interstitial";
        public String ad_manager_rewarded_unit_id = "/6499/example/rewarded";
        public String ad_manager_open_app_unit_id = "/6499/example/app-open";

        /* ad unit for FAN */
        public String ad_fan_banner_unit_id = "YOUR_PLACEMENT_ID";
        public String ad_fan_interstitial_unit_id = "YOUR_PLACEMENT_ID";
        public String ad_fan_rewarded_unit_id = "VID_HD_9_16_39S_APP_INSTALL";

        /* ad unit for IRON SOURCE */
        public String ad_ironsource_app_key = "170112cfd";
        public String ad_ironsource_banner_unit_id = "DefaultBanner";
        public String ad_ironsource_rewarded_unit_id = "DefaultRewardedVideo";
        public String ad_ironsource_interstitial_unit_id = "DefaultInterstitial";

        /* ad unit for UNITY */
        public String ad_unity_game_id = "4988568";
        public String ad_unity_banner_unit_id = "Banner_Android";
        public String ad_unity_rewarded_unit_id = "Rewarded_Android";
        public String ad_unity_interstitial_unit_id = "Interstitial_Android";

        /* ad unit for APPLOVIN MAX */
        public String ad_applovin_banner_unit_id = "a3a3a5b44c763304";
        public String ad_applovin_interstitial_unit_id = "35f9c01af124fcb9";
        public String ad_applovin_rewarded_unit_id = "21dba76a66f7c9fe";
        public String ad_applovin_open_app_unit_id = "7c3fcecd43d3f90c";

        /* ad unit for APPLOVIN DISCOVERY */
        public String ad_applovin_banner_zone_id = "";
        public String ad_applovin_interstitial_zone_id = "";
        public String ad_applovin_rewarded_zone_id = "";

        /* ad unit for STARTAPP */
        public String ad_startapp_app_id = "0";

        /* ad unit for WORTISE */
        public String ad_wortise_app_id = "test-app-id";
        public String ad_wortise_banner_unit_id = "test-banner";
        public String ad_wortise_interstitial_unit_id = "test-interstitial";
        public String ad_wortise_rewarded_unit_id = "test-rewarded";
        public String ad_wortise_open_app_unit_id = "test-app-open";
    }

}
