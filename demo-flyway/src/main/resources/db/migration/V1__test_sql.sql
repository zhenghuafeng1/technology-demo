INSERT INTO comm_core_spi_interface
(interface_id, interface_version, interface_status, remote_address, protocol, request_type, preprocess, auth, request_format, request_converter, response_format, response_converter, connect_timeout, read_timeout, properties, created_time, updated_time, log_enable)
VALUES('matomo.analytics.send', 'RegionOne', '1', 'https://cretrackingdata.matomo.cloud/matomo.php', 'HTTP', 'GET', NULL, NULL, 'pathFormatServer', 'defaultConvertServer', 'jsonFormatServer', 'fullConvertServer', 20000, 30000, NULL, '2022-11-30 08:24:26', '2022-11-30 08:24:26', 'true');
